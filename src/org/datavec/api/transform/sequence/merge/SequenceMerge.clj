(ns org.datavec.api.transform.sequence.merge.SequenceMerge
  "Merge multiple sequences into one single sequence.
 Requires a SequenceComparator to determine
 the final ordering"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.merge SequenceMerge]))

(defn ->sequence-merge
  "Constructor.

  comparator - `org.datavec.api.transform.sequence.SequenceComparator`"
  (^SequenceMerge [^org.datavec.api.transform.sequence.SequenceComparator comparator]
    (new SequenceMerge comparator)))

(defn merge-sequences
  "multiple-sequences - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceMerge this ^java.util.List multiple-sequences]
    (-> this (.mergeSequences multiple-sequences))))

