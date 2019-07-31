(ns org.datavec.api.records.impl.SequenceRecord
  "A standard implementation of the SequenceRecord interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.impl SequenceRecord]))

(defn ->sequence-record
  "Constructor."
  (^SequenceRecord []
    (new SequenceRecord )))

(defn get-sequence-length
  "Description copied from interface: SequenceRecord

  returns: Length of sequence record - `int`"
  (^Integer [^SequenceRecord this]
    (-> this (.getSequenceLength))))

(defn get-time-step
  "Description copied from interface: SequenceRecord

  time-step - Time step to get. Must be 0 <= timeStep < getSequenceLength() - `int`

  returns: Values for a single time step - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^SequenceRecord this ^Integer time-step]
    (-> this (.getTimeStep time-step))))

