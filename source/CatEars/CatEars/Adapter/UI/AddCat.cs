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
    public partial class AddCat : Form
    {
        public event EventHandler<EventArgs> Saved;

        private ICatRepository catRepository;

        public AddCat(ICatRepository catRepository)
        {
            this.catRepository = catRepository;
            InitializeComponent();
            InitializeUx();
        }

        private void InitializeUx()
        {
            string[] breedNames = Enum.GetNames(typeof(BreedEnum));
            uxCatBreed.Items.AddRange(breedNames);
        }

        private void uxCancel_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void uxSave_Click(object sender, EventArgs e)
        {
            BreedEnum breed = (BreedEnum)Enum.Parse(typeof(BreedEnum), uxCatBreed.Text);
            Cat newCat = Cat.ForPersistance(uxCatName.Text, breed);
            catRepository.Save(newCat);
            Saved?.Invoke(this, EventArgs.Empty);
            Close();
        }
    }
}
