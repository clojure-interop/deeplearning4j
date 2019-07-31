(ns org.datavec.spark.transform.misc.SequenceMergeFunction
  "Spark function for merging multiple sequences, using a SequenceMerge instance.
 Typical usage:


  JavaPairRDD<SomeKey,List<List<Writable>>> myData = ...;
  SequenceComparator comparator = ...;
  SequenceMergeFunction<String> sequenceMergeFunction = new SequenceMergeFunction<>(new SequenceMerge(comparator));
  JavaRDD<List<List<Writable>>> merged = myData.groupByKey().map(sequenceMergeFunction);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc SequenceMergeFunction]))

(defn ->sequence-merge-function
  "Constructor.

  sequence-merge - `org.datavec.api.transform.sequence.merge.SequenceMerge`"
  (^SequenceMergeFunction [^org.datavec.api.transform.sequence.merge.SequenceMerge sequence-merge]
    (new SequenceMergeFunction sequence-merge)))

(defn call
  "t-2 - `scala.Tuple2`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^SequenceMergeFunction this ^scala.Tuple2 t-2]
    (-> this (.call t-2))))

