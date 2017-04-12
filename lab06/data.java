import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Usama Tahir on 4/11/2017.
 */
public class data {
//    public static void main(String[] args)
//    {
//        Session session = Hibernate.getfactory().openSession();
//        String hql = "FROM persistantClass";
//        Query query = session.createQuery(hql);
//        List<persistantClass> list = query.list();
//        if (!list.isEmpty())
//        {
//            System.out.println("List is empty");
//        }
//        else System.out.println("Lisy me");
////        for (int i =0;i<list.size();i++)
////        {
////            System.out.println(list.get(i).getCountry());
////            System.out.println(list.get(i).getId());
////        }
////        List<persistantClass> employees = (List<persistantClass>) session.createCriteria(persistantClass.class).list();
//        System.out.println(list.getClass().getName());
//
//
//    }
    public static List<persistantClass> getData()
    {
        Session session = Hibernate.getfactory().openSession();
        String hql = "FROM persistantClass";
        Query q = session.createQuery(hql);
        List<persistantClass> list = q.list();
//        session.close();
//
        if(!list.isEmpty())
        {

            return list;
        }
        else if(list.isEmpty())
        {
            String csv = "C:/Users/Usama Tahir/IdeaProjects/lab06/src/GeoLiteCity.csv";
            String line = "\n";
            String csvSplitBy = ",";
            BufferedReader br = null;
            try {
                ArrayList<String []> listA = new ArrayList<>();
                br = new BufferedReader(new FileReader(csv));
                br.readLine();
                br.readLine();
                while ((line=br.readLine())!=null)
                {
                    String[] location = line.split(csvSplitBy);
                    location = filter(location);
                    listA.add(location);
                }
                addRow(listA);

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
//        Session session1 = Hibernate.getfactory().openSession();
        Query query = session.createQuery(hql);
        List<persistantClass> list2 = query.list();
        session.close();
        return list2;


    }
    public static String[] filter(String[] s)
    {
        String [] temp = new String [9];
        int i = 0;
        for (String ss : s)
        {
            if(ss.isEmpty())
            {
                ss=null;
                temp[i] = ss;
            }
            else
            {
                ss = ss.replace("\"","");
                temp[i] = ss;
            }
            i++;
        }
        for (;i<temp.length;i++)
        {
            temp[i] = "";
        }
        return temp;
    }
    public static void addRow(ArrayList<String []> aa)
    {
        Session session = Hibernate.getfactory().openSession();
        Transaction t = null;
        try {
            t =session.beginTransaction();
            for (String [] temp:aa)
            {
                String [] tempo = temp;
                int val = Integer.parseInt(tempo[0]);
                persistantClass pers = new persistantClass(val,tempo[1],tempo[2],tempo[3],tempo[4],tempo[5],tempo[6],tempo[7],tempo[8]);
                session.save(pers);

            }
            t.commit();
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
}
