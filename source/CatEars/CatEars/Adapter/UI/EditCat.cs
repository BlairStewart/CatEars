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
        private Cat cat;

        public EventHandler<EventArgs> Saved;
        public EditCat(ICatRepository catRepository, Cat cat)
        {
            this.catRepository = catRepository;
            this.cat = cat;
            InitializeComponent();
            FillUi(cat);
        }

        private void FillUi(Cat cat)
        {
            uxId.Text = cat.CatId.GetValue().ToString();
            uxCatName.Text = cat.Name;
            uxCatBreed.Text = cat.Breed.ToString();
            uxCreated.Text = cat.DateCreated;
            uxUpdated.Text = cat.DateUpdated;
            uxDeleted.Text = cat.DateDeleted;
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
            catRepository.Save(cat);
            Saved?.Invoke(this, EventArgs.Empty);
        }
    }
}
