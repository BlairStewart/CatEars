using System;
using System.Collections.Generic;

namespace CatEars.Domain
{
    public class Interaction
    {
        private InteractionId interactionId;
        private CatId catId;
        private InteractionTypeEnum interactionType;
        private String createdDate;

        public static Interaction ForPersistance(CatId catId, InteractionTypeEnum interactionType)
        {
            return new Interaction(null, catId, interactionType, null);
        }

        public Interaction(InteractionId interactionId, CatId catId, InteractionTypeEnum interactionType, string createdDate)
        {
            this.interactionId = interactionId;
            this.catId = catId;
            this.interactionType = interactionType;
            this.createdDate = createdDate;
        }

        public InteractionId InteractionId { get => interactionId; }
        public CatId CatId { get => catId; }
        public InteractionTypeEnum InteractionType { get => interactionType; }
        public String CreatedDate { get => createdDate; }

        public override bool Equals(object obj)
        {
            var interaction = obj as Interaction;
            return interaction != null &&
                   EqualityComparer<InteractionId>.Default.Equals(interactionId, interaction.interactionId) &&
                   EqualityComparer<CatId>.Default.Equals(catId, interaction.catId) &&
                   interactionType == interaction.interactionType &&
                   createdDate == interaction.createdDate;
        }

        public override int GetHashCode()
        {
            var hashCode = -724832774;
            hashCode = hashCode * -1521134295 + EqualityComparer<InteractionId>.Default.GetHashCode(interactionId);
            hashCode = hashCode * -1521134295 + EqualityComparer<CatId>.Default.GetHashCode(catId);
            hashCode = hashCode * -1521134295 + interactionType.GetHashCode();
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(createdDate);
            return hashCode;
        }

        public override string ToString()
        {
            return $"{interactionType} -- {createdDate}";
        }
    }
}
