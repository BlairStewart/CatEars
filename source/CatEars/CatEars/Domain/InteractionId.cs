namespace CatEars.Domain
{
    public class InteractionId : IntegerId
    {
        public static InteractionId Of(int value)
        {
            return new InteractionId(value);
        }

        protected InteractionId(int value) : base(value)
        {
        }
    }
}