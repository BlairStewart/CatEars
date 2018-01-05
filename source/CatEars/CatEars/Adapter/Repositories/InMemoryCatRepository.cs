using System;
using System.Collections.Generic;
using System.Linq;
using CatEars.Domain;
using CatEars.Domain.Repositories;

namespace CatEars.Adapter.Repositories
{
    public class InMemoryCatRepository : ICatRepository
    {
        private IDictionary<CatId, Cat> dictionary;
        private int autoIncrement;

        public InMemoryCatRepository()
        {
            dictionary = new Dictionary<CatId, Cat>();
            autoIncrement = 1;
        }

        public void Delete(CatId catId)
        {
            Cat toBeSoftDeleted = Retrieve(catId);
            if (toBeSoftDeleted != null)
            {
                Save(toBeSoftDeleted.WithDeletedDate(DateTime.UtcNow.ToString()));
            }
        }

        public Cat Retrieve(CatId catId)
        {
            if (dictionary.ContainsKey(catId))
            {
                return dictionary[catId];
            }
            return null;
        }

        public IEnumerable<Cat> RetrieveAll()
        {
            return from x in dictionary.Values
                   where x.DateDeleted == null
                   select x;
        }

        public Cat Save(Cat cat)
        {
            Cat newCat = cat.WithUpdatedDate(DateTime.UtcNow.ToString());
            if (cat.CatId == null)
            {
                newCat = new Cat(
                    CatId.Of(autoIncrement),
                    cat.Name,
                    cat.Breed,
                    DateTime.UtcNow.ToString(),
                    DateTime.UtcNow.ToString(),
                    null
                );
                autoIncrement++;
            }

            dictionary[newCat.CatId] = newCat;
            return newCat;
        }
    }
}
