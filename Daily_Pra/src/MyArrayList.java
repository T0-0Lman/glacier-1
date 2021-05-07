import java.util.Arrays;

public class MyArrayList {
        public int[] elem;
        public int usedSize;
        public MyArrayList(){
            this.elem = new int[5];
        }

        public void disPlay(){
            for(int i = 0;i<this.usedSize;i++){
                System.out.print(this.elem[i] + " ");
            }
            System.out.println();
        }

        public boolean isFull(){
            return this.elem.length == this.usedSize;
        }

        public void add(int pos,int data){
            if(this.isFull()){
                this.elem = Arrays.copyOf(this.elem,2* this.elem.length);
            }
            if(pos<0 || pos>this.usedSize){
                System.out.println("pos位置非法！");
                return;
            }
            for(int i = this.usedSize-1;i>=pos;i--){
                this.elem[i+1] = this.elem[i];
            }
                this.elem[pos] = data;
                usedSize++;
        }


        public boolean contains(int toFind){
            for(int i = 0; i<this.usedSize;i++){
                if(toFind == this.elem[i]){
                    return true;
                }
            }
            return false;
        }

        public int search(int toFind){
            for(int i = 0; i<this.usedSize;i++){
                if(toFind == this.elem[i]){
                    return i;
                }
            }
            return -1;
        }

        public int getPos(int pos){
            if(pos < 0 || pos >= this.usedSize) {
                throw new UnsupportedOperationException("pos位置不合法！");
            }
            return this.elem[pos];
        }

        public void setPos(int pos,int value){
            if(pos < 0 || pos >= this.usedSize){
                System.out.println("pos位置不合法!");
                return;
            }
            this.elem[pos] = value;
        }

        public void remove(int key){
            int index = this.search(5);
            if( index == -1){
                System.out.println("删除位置不合法！");
                return;
            }
            for(int i = index;i< this.usedSize - 1;i++){
                this.elem[i] = this.elem[i+1];
            }
            this.usedSize--;
        }

        public int size(){
            return this.elem.length;
        }

        public void clear(){
                this.usedSize = 0;
        }
}

