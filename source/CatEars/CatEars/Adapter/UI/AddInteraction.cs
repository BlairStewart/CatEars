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
    public partial class AddInteraction : Form
    {
        public EventHandler<EventArgs> Saved;

        private IInteractionRepository interactionRepository;

        private CatId catId;
        public AddInteraction(IInteractionRepository interactionRepository, CatId catId)
        {
            this.interactionRepository = interactionRepository;
            this.catId = catId;
            InitializeComponent();
            InitializeUx();
        }

        private void InitializeUx()
        {
            string[] interactionTypes = Enum.GetNames(typeof(InteractionTypeEnum));
            uxInteractionType.Items.AddRange(interactionTypes);
        }

        private void uxCancel_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void uxSave_Click(object sender, EventArgs e)
        {
            Interaction interaction = Interaction.ForPersistance(
                catId,
                (InteractionTypeEnum)Enum.Parse(typeof(InteractionTypeEnum), uxInteractionType.Text)
            );
            interactionRepository.Save(interaction);
            Saved?.Invoke(this, EventArgs.Empty);
            Close();
        }
    }
}
