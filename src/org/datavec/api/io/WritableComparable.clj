(ns org.datavec.api.io.WritableComparable
  "A Writable which is also Comparable.
 WritableComparables can be compared to each other, typically
 via Comparators. Any type which is to be used as a
 key in the Hadoop Map-Reduce framework should implement this
 interface.
 Example:


      public class MyWritableComparable implements WritableComparable {
        // Some data
        private int counter;
        private long timestamp;

        public void write(DataOutput out) throws IOException {
          out.writeInt(counter);
          out.writeLong(timestamp);
        }

        public void readFields(DataInput in) throws IOException {
          counter = in.readInt();
          timestamp = in.readLong();
        }

        public int compareTo(MyWritableComparable w) {
          int thisValue = this.value;
          int thatValue = ((IntWritable)o).value;
          return (thisValue < thatValue ? -1 : (thisValue==thatValue ? 0 : 1));
        }
      }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io WritableComparable]))

