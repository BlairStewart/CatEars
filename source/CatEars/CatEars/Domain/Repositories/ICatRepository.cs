using System.Collections.Generic;

namespace CatEars.Domain.Repositories
{
    public interface ICatRepository
    {
        Cat Save(Cat cat);
        void Delete(CatId catId);
        Cat Retrieve(CatId catId);
        IEnumerable<Cat> RetrieveAll();
    }
}
