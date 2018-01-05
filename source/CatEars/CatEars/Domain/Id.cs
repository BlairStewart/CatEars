using System.Collections.Generic;

namespace CatEars.Domain
{
    public class Id<T>
    {
        private T value;

        protected Id(T value) {
            this.value = value;
        }

        public override bool Equals(object obj)
        {
            var id = obj as Id<T>;
            return id != null &&
                   EqualityComparer<T>.Default.Equals(value, id.value);
        }

        public override int GetHashCode()
        {
            return -1584136870 + EqualityComparer<T>.Default.GetHashCode(value);
        }

        public T GetValue()
        {
            return value;
        }
    }
}