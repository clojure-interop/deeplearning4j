(ns org.datavec.api.writable.LongWritable$DecreasingComparator
  "A decreasing Comparator optimized for LongWritable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable LongWritable$DecreasingComparator]))

(defn ->decreasing-comparator
  "Constructor."
  (^LongWritable$DecreasingComparator []
    (new LongWritable$DecreasingComparator )))

(defn compare
  "Description copied from class: WritableComparator

  b-1 - `byte[]`
  s-1 - `int`
  l-1 - `int`
  b-2 - `byte[]`
  s-2 - `int`
  l-2 - `int`

  returns: `int`"
  (^Integer [^LongWritable$DecreasingComparator this b-1 ^Integer s-1 ^Integer l-1 b-2 ^Integer s-2 ^Integer l-2]
    (-> this (.compare b-1 s-1 l-1 b-2 s-2 l-2)))
  (^Integer [^LongWritable$DecreasingComparator this ^org.datavec.api.io.WritableComparable a ^org.datavec.api.io.WritableComparable b]
    (-> this (.compare a b))))

