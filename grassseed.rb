c = gets.to_f
l = gets.to_i
i,sum=0,0
if c > 0 and c <= 100 and l > 0 and l <= 100
   while i < l
       w,l1 =gets.chomp.split.map(&:to_f)
       sum = sum + w * l1;
       i = i + 1
   end
  tc = sum *c
  print(tc)
end