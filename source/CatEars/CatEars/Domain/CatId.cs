namespace CatEars.Domain
{
    public class CatId : IntegerId
    {

        public static CatId Of(int value)
        {
            return new CatId(value);
        }

        protected CatId(int value) : base(value)
        {
        }
    }
}