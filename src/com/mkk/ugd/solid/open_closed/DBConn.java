package com.mkk.ugd.solid.open_closed;

import com.mkk.ugd.interfaces.java8.connection.program.MySQLConnection;
import com.mkk.ugd.interfaces.java8.connection.program.OracleConnection;

/*
    Kod, gelişime açık, değiştirmeye kapalı olmalıdır.

    OPEN-CLOSED prensibine aykırı

    Neden ? Çünkü burada, her yeni sınıf eklendiğinde (ör: DerbyConnection)
    var olan kod içerisinde değiştirme yapmak zorundayız.
    Bu durum, Open-Closed prensibine aykırı.
 */
public class DBConn
{
    // Bunun yerine, ilgili işlemleri yaptıran metotlar tanımlanmalıdır.
    public void connect(Connectable connectable)
    {
        if(connectable instanceof OracleConnection)
        {

        }
        else if(connectable instanceof MySQLConnection)
        {

        }
    }
}
