using System;
using System.Collections.Generic;
using System.Linq;
using CatEars.Domain;
using CatEars.Domain.Repositories;

namespace CatEars.Adapter.Repositories
{
    public class InMemoryInteractionRepository : IInteractionRepository
    {

        private IDictionary<InteractionId, Interaction> dictionary;
        private int autoIncrement;

        public InMemoryInteractionRepository()
        {
            dictionary = new Dictionary<InteractionId, Interaction>();
            autoIncrement = 1;
        }

        public void Delete(InteractionId interactionId)
        {
            dictionary.Remove(interactionId);
        }

        public Interaction Retrieve(InteractionId interactionId)
        {
            if (dictionary.ContainsKey(interactionId))
            {
                return dictionary[interactionId];
            }
            return null;
        }

        public IEnumerable<Interaction> RetrieveAll()
        {
            return dictionary.Values;
        }

        public IEnumerable<Interaction> RetrieveAllForCat(CatId catId)
        {
            return from x in dictionary.Values
                   where x.CatId.Equals(catId)
                   select x;
        }

        public Interaction Save(Interaction interaction)
        {
            Interaction newInteraction = interaction;
            if (interaction.InteractionId == null)
            {
                newInteraction = new Interaction(
                    InteractionId.Of(autoIncrement),
                    interaction.CatId,
                    interaction.InteractionType,
                    DateTime.UtcNow.ToString());
                autoIncrement++;
            }

            dictionary[newInteraction.InteractionId] = newInteraction;
            return newInteraction;
        }
    }
}
