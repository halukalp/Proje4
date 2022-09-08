package com.mkk.ugd.utility;

import javax.swing.*;
import java.util.List;

public final class Util
{
    private static final int TCKN_HANE = 11;

    private Util() {}

    public static<E> String arrangeList(List<E> list)
    {
        return list.toString().replace("[", "").replace("]", "").replace(",", "");
    }

    // kaynak: Ahmet Bütün
    private static boolean isValidTCKN(Long TCKN)
    {
        String tmp = TCKN.toString();

        if (tmp.length() == TCKN_HANE)
        {
            int totalOdd = 0;

            int totalEven = 0;

            for (int i = 0; i < 9; i++) {
                int val = Integer.valueOf(tmp.substring(i, i + 1));

                if (i % 2 == 0) {
                    totalOdd += val;
                } else {
                    totalEven += val;
                }
            }

            int total = totalOdd + totalEven
                    + Integer.valueOf(tmp.substring(9, 10));

            int lastDigit = total % 10;

            if (tmp.substring(10).equals(String.valueOf(lastDigit)))
            {
                int check = (totalOdd * 7 - totalEven) % 10;

                if (tmp.substring(9, 10).equals(String.valueOf(check)))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isValidTCKN(String TCKN)
    {
        if (null!=TCKN && TCKN.matches("^([1-9]{1}[0-9]{10})$"))
        {
            return isValidTCKN(Long.valueOf(TCKN));
        }

        return false;
    }

    public static void showGeneralExceptionInfo(Exception e)
    {
        showErrorMessage(createGeneralExceptionInfo(e));
    }

    public static String createGeneralExceptionInfo(Exception e)
    {
        return e.getClass().getSimpleName() + " has been occured. Exception message: " + e.getMessage();
    }

    public static <E> void showList(List<E> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println( list.get(i) );
        }
    }

    public static <E> void showArray(E[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void showAddressInfo(Object obj)
    {
        System.out.println("\n" + obj.getClass().getSimpleName() + " hashcode: " + obj.hashCode()
                + " address: " + Integer.toHexString(obj.hashCode()));
    }

    public static void showEqualsInfo(Object obj1, Object obj2)
    {
        String name1 = null;
        String name2 = null;
        if(obj1 != null)
        {
            name1 = obj1.getClass().getSimpleName();
        }
        if(obj2!= null)
        {
            name2 = obj2.getClass().getSimpleName();
        }

        if( obj1.equals(obj2) )
        {
            System.out.println("First " + name1
                    + " equals second " + name2);
        }
        else
        {
            System.out.println("First " + name1
                    + " not equals second " + name2);
        }
    }

    public static void showInfoMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Info Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showWarningMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Warning Message", JOptionPane.WARNING_MESSAGE);
    }

    public static void showErrorMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    public static void showQuestionMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Question Message", JOptionPane.QUESTION_MESSAGE);
    }
}
