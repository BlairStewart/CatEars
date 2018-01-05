using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CatEars.Adapter.UI
{
    public partial class Confirmation : Form
    {
        public EventHandler<EventArgs> Yes;
        public EventHandler<EventArgs> No;
    
        public Confirmation(string message)
        {
            InitializeComponent();
            uxMessage.Text = message;
        }

        private void uxNo_Click(object sender, EventArgs e)
        {
            No?.Invoke(this, EventArgs.Empty);
            Close();
        }

        private void uxYes_Click(object sender, EventArgs e)
        {
            Yes?.Invoke(this, EventArgs.Empty);
            Close();
        }
    }
}
