using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CatEars.Adapter.UI;
using CatEars.Domain.Repositories;
using CatEars.Adapter.Repositories;

namespace CatEars
{
    public partial class Form1 : Form
    {
        ICatRepository catRepository;

        public Form1()
        {
            catRepository = new InMemoryCatRepository();
            InitializeComponent();
        }

        private void uxAddCat_Click(object sender, EventArgs e)
        {
            AddCat addCatForm = new AddCat(catRepository);
            addCatForm.TopLevel = false;
            Controls.Add(addCatForm);
            addCatForm.Show();
            addCatForm.BringToFront();
        }
    }
}
