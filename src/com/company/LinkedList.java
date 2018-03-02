package com.company;

public class LinkedList<DataType>
{
    private LinkedNode<DataType>    front_element = null;
    private LinkedNode<DataType>    back_element = null;


    private int                     size = 0;

    public LinkedNode<DataType>  getElementAtIndex(int index)
    {
        int i = 0;
        for (LinkedNode<DataType> it = this.front_element; it != null; it = it.next)
        {
            if ( i == index)
            {
                return it;
            }
            ++i;
        }
        return null;
    }

    public LinkedNode<DataType>  getElementWithValue(Class<DataType> data_value){ return null;};
    public LinkedNode<DataType>  getFront(){ return null;};
    public LinkedNode<DataType>  getBack(){ return null;};

    public void        pushFront(DataType data)
    {
        LinkedNode<DataType>    new_element = new LinkedNode<DataType>(data);

        new_element.setNextElement(this.front_element);
        if (this.front_element != null)
            this.front_element.setPreviousElement(new_element);
        this.front_element = new_element;
    }

    public void        pushBack(DataType data)
    {
        LinkedNode<DataType>    new_element = new LinkedNode<DataType>(data);

        new_element.setPreviousElement(this.back_element);
        if (this.back_element != null)
            this.back_element.setNextElement(new_element);
        this.back_element = new_element;
    }

    public void        insertElementAtIndex(DataType data, int index)
    {
        LinkedNode<DataType>    current = this.getElementAtIndex(index);
        LinkedNode<DataType>    new_element = new LinkedNode<DataType>(data);

        if (current != null)
        {
            System.out.println("Elem ["+index+"] = "+current.data);
            LinkedNode<DataType>  current_previous = current.previous;
            LinkedNode<DataType>  current_next = current.next;
            if (current_previous != null)
                current_previous.linkAsPreviousElementOf(new_element);
            current.setNextElement(new_element);
            if (current_next != null)
                current_next.linkAsNextElementOf(new_element);
        }
    }

    public void        deleteElementAtIndex(int index) {};
    public void        deleteElementsWithValue(DataType data)
    {

    }

    public int         getSize()
    {
        int     size = 0;
        for (LinkedNode<DataType> i = this.front_element; i != null; i = i.next)
        {
            ++size;
        }
        return size;
    }

    public void         printSelf()
    {
        int index = 0;
        for (LinkedNode<DataType> i = this.front_element; i != null; i = i.next)
        {
            System.out.println("Elem ["+index+"] = "+i.data);
            ++index;
        }
    }


    public LinkedList()
    {
    }
}
