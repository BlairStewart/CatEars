using System.Collections.Generic;

namespace CatEars.Domain.Repositories
{
    public interface IInteractionRepository
    {
        Interaction Save(Interaction interaction);
        void Delete(InteractionId interactionId);
        Interaction Retrieve(InteractionId interactionId);
        IEnumerable<Interaction> RetrieveAll();
    }
}
