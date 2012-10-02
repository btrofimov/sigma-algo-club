using System;
using System.Collections.Generic;

namespace InsertionSort
{
    class Program
    {
        static void Main(string[] args)
        {
            var massive = new[] { 5, 2, 4, 6, 1, 3 };

            ViewValue(GetInsertionSortByOrderOfGrowth(massive));

            ViewValue(GetInsertionSortByOrderOforderDecrease(massive));

            Console.ReadLine();
        }

        private static void ViewValue(IEnumerable<int> result)
        {
            Console.WriteLine();
            foreach (var item in result)
            {
                Console.WriteLine(item);
            }
        }

        private static IEnumerable<int> GetInsertionSortByOrderOfGrowth(IList<int> massive)
        {
            for (var j = 1; j < massive.Count; j++)
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
        private static IEnumerable<int> GetInsertionSortByOrderOforderDecrease(IList<int> massive)
        {
            for (var j = 1; j < massive.Count; j++)
            {
                var key = massive[j];

                var i = j - 1;

                while (i > -1 && massive[i] < key)
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
