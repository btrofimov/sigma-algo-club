namespace InsertionSort
{
    class Program
    {
        static void Main()
        {   
            var massive = new[] { 5, 2, 4, 6, 1, 3 };

            var result = GetInsertionSort(massive);
        }

        private static int[] GetInsertionSort(int[] massive)
        {
            for (var j = 1; j < massive.Length; j++)
            {
                var key = massive[j];

                var i = j - 1;

                while (i > -1 && massive[i] > key)
                {
                    massive[i + 1] = massive[i];
                    i = i - 1;
                    massive[i + 1] = key;
                }
            }
            return massive;
        }
    }
}
