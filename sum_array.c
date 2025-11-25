#include <stdio.h>

int sum_array(const int *arr, int length) {
    int sum = 0;
    for (int i = 0; i < length; i++) {
        sum += arr[i];
    }
    return sum;
}

int main(void) {
    int numbers[] = {1, 2, 3, 4, 5};
    int length = sizeof(numbers) / sizeof(numbers[0]);

    int result = sum_array(numbers, length);
    printf("Sum of array = %d\n", result);

    return 0;
}
