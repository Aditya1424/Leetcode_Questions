class Solution {
        public List<Integer> lexicalOrder(int n) {
                List<Integer>list = new ArrayList<>();
                        Lexo(n,0,list);
                                return list;
                                    }
                                        public static void Lexo(int n,int curr,List<Integer>list){
                                                if(curr>n){
                                                            return;
                                                                    }
                                                                            if(curr!=0){
                                                                                        list.add(curr);
                                                                                                }
                                                                                                        int i=0;
                                                                                                                if(curr==0){
                                                                                                                            i=1;
                                                                                                                                    }
                                                                                                                                            for(;i<=9;i++){
                                                                                                                                                        Lexo(n,curr*10+i,list);
                                                                                                                                                                }
                                                                                                                                                                    }
                                                                                                                                                                    }
