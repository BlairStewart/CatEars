using System;
using System.Collections.Generic;

namespace CatEars.Domain
{
    public class Cat
    {
        private CatId catId;
        private String name;
        private BreedEnum breed;
        private String dateCreated;
        private String dateUpdated;
        private String dateDeleted;

        public static Cat ForPersistance(string name, BreedEnum breed)
        {
            return new Cat(null, name, breed, null, null, null);
        }

        public Cat(CatId catId, string name, BreedEnum breed, string dateCreated, string dateUpdated, string dateDeleted)
        {
            this.catId = catId;
            this.name = name;
            this.breed = breed;
            this.dateCreated = dateCreated;
            this.dateUpdated = dateUpdated;
            this.dateDeleted = dateDeleted;
        }

        public CatId CatId { get => catId; }
        public string Name { get => name; }
        public BreedEnum Breed { get => breed; }
        public string DateCreated { get => dateCreated; }
        public string DateUpdated { get => dateUpdated; }
        public string DateDeleted { get => dateDeleted; }

        public override bool Equals(object obj)
        {
            var cat = obj as Cat;
            return cat != null &&
                   catId == cat.catId &&
                   name == cat.name &&
                   breed == cat.breed &&
                   dateCreated == cat.dateCreated &&
                   dateUpdated == cat.dateUpdated &&
                   dateDeleted == cat.dateDeleted;
        }

        public override int GetHashCode()
        {
            var hashCode = 1127397456;
            hashCode = hashCode * -1521134295 + catId.GetHashCode();
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(name);
            hashCode = hashCode * -1521134295 + breed.GetHashCode();
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(dateCreated);
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(dateUpdated);
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(dateDeleted);
            return hashCode;
        }

        public Cat WithUpdatedDate(string updatedDate)
        {
            return new Cat(
                catId,
                name,
                breed,
                dateCreated,
                updatedDate,
                dateDeleted);
        }

        public Cat WithDeletedDate(string deletedDate)
        {
            return new Cat(
                catId,
                name,
                breed,
                dateCreated,
                dateUpdated,
                deletedDate);
        }
    }
}
