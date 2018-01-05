namespace CatEars.Domain
{
    public class IntegerId : Id<int>
    {
        protected IntegerId(int value) : base(value)
        {
        }
    }
}