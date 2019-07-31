(ns org.datavec.local.transforms.misc.SequenceMergeFunction
  "Function for merging multiple sequences, using a SequenceMerge instance.
 Typical usage:


  JavaPairRDD<SomeKey,List<List<Writable>>> myData = ...;
  SequenceComparator comparator = ...;
  SequenceMergeFunction<String> sequenceMergeFunction = new SequenceMergeFunction<>(new SequenceMerge(comparator));
  JavaRDD<List<List<Writable>>> merged = myData.groupByKey().map(sequenceMergeFunction);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc SequenceMergeFunction]))

(defn ->sequence-merge-function
  "Constructor.

  sequence-merge - `org.datavec.api.transform.sequence.merge.SequenceMerge`"
  (^SequenceMergeFunction [^org.datavec.api.transform.sequence.merge.SequenceMerge sequence-merge]
    (new SequenceMergeFunction sequence-merge)))

(defn apply
  "Description copied from interface: Function

  t-2 - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceMergeFunction this ^org.nd4j.linalg.primitives.Pair t-2]
    (-> this (.apply t-2))))

