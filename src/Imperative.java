public class Imperative {
    /**
     * ��� ������ ����� ����� numbers.���������� �������� � ������������ ����� ��������� ���
     * ���������� ����� � ������ � ������� ��������.
     **/

    public void Imp_descending_sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
