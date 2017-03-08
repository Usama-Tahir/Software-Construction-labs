using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TvStation
{
    class node{
        public string Channel;
        public int Id;
        public string description;
        public node next;
        public node()
        {
            Channel = "";
            Id = 0;
            description = "";
            next = null;
        }
        

    }
    class TvManager
    {
        node head;
        
        public TvManager()
        {
            head = null;
        }
        public void addChannel(string ch,int id,string desc)
        {
            node newNode = new node();
            newNode.Channel = ch;
            newNode.Id = id;
            newNode.description = desc;
           // node temp = new node();
            node temp = head;
            if(temp==null)
            {
                temp = newNode;
                head = temp;
                head.next = null;
            }
            else if(temp!=null)
            {
              while(temp.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = null;
            }
        }

        public void print()
        {
            node IterateNode = head;
            while(IterateNode!=null)
            {
                Console.WriteLine(IterateNode.Channel);
                IterateNode = IterateNode.next;
            }
        }
    }

    class Tv
    {
        static void Main(string[] args)
        {
            TvManager t1 = new TvManager();
            t1.addChannel("one", 1, "trying");
            t1.addChannel("two", 2, "not trying");
            t1.print();
        }
    }
}
