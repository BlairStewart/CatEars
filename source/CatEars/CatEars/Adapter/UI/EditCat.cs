using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CatEars.Domain;
using CatEars.Domain.Repositories;

namespace CatEars.Adapter.UI
{
    public partial class EditCat : Form
    {
        private ICatRepository catRepository;
        private IInteractionRepository interactionRepository;
        private Cat cat;
        private IDictionary<int, Interaction> interactionListIndex;

        public EventHandler<EventArgs> Saved;
        public EditCat(ICatRepository catRepository, IInteractionRepository interactionRepository, Cat cat)
        {
            this.catRepository = catRepository;
            this.interactionRepository = interactionRepository;
            this.cat = cat;
            this.interactionListIndex = new Dictionary<int, Interaction>();
            InitializeComponent();
            InitializeUx();
            FillUi(cat);
            LoadInteractionList();
        }

        private void InitializeUx()
        {
            string[] breedNames = Enum.GetNames(typeof(BreedEnum));
            uxCatBreed.Items.AddRange(breedNames);
        }

        private void FillUi(Cat cat)
        {
            uxId.Text = cat.CatId.GetValue().ToString();
            uxCatName.Text = cat.Name;
            uxCatName.SelectionStart = uxCatName.Text.Length;
            uxCatBreed.Text = cat.Breed.ToString();
            uxCreated.Text = cat.DateCreated;
            uxUpdated.Text = cat.DateUpdated;
            uxDeleted.Text = cat.DateDeleted;
        }

        private void LoadInteractionList()
        {
            var interactions = interactionRepository.RetrieveAllForCat(cat.CatId);
            interactionListIndex.Clear();
            uxInteractions.Items.Clear();
            foreach (var interaction in interactions)
            {
                interactionListIndex.Add(
                    uxInteractions.Items.Add(
                        interaction.ToString()
                        ), 
                    interaction);
            }
        }

        private void uxCancel_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void uxSave_Click(object sender, EventArgs e)
        {
            Cat updateCat = new Cat(
                cat.CatId,
                uxCatName.Text,
                (BreedEnum)Enum.Parse(typeof(BreedEnum), uxCatBreed.Text),
                cat.DateCreated,
                cat.DateUpdated,
                cat.DateDeleted
                );
            catRepository.Save(updateCat);
            Saved?.Invoke(this, EventArgs.Empty);
            Close();
        }

        private void uxAddInteraction_Click(object sender, EventArgs e)
        {
            AddInteraction addInteractionForm = new AddInteraction(interactionRepository, cat.CatId)
            {
                TopLevel = false
            };
            addInteractionForm.Saved += addInteractionForm_Saved;
            Parent.Controls.Add(addInteractionForm);
            addInteractionForm.Show();
            addInteractionForm.BringToFront();
        }

        private void addInteractionForm_Saved(object sender, EventArgs e)
        {
            LoadInteractionList();
        }

        private void uxInteractions_Click(object sender, EventArgs e)
        {

        }
    }
}
