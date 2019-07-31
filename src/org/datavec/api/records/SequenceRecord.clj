(ns org.datavec.api.records.SequenceRecord
  "A SequenceRecord contains a set of values for a single sequence or time series (usually with multiple values per time step,
 and multiple time steps).
 Each value in the Record is represented by Writable object; each time step is thus a List<Writable> and
 the entire sequence is represented by a List<List<Writable>>, where the outer list is over time steps, and
 the inner list is over values for a given time step.
 The SequenceRecord may (optionally) also have a RecordMetaData instance, that represents metadata (source
 location, etc) for the record.
 For standard (non-sequential) data, see Record"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records SequenceRecord]))

(defn get-sequence-record
  "Get the sequence record values

  returns: Sequence record values - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceRecord this]
    (-> this (.getSequenceRecord))))

(defn get-sequence-length
  "Get the overall length of the sequence record (number of time/sequence steps, etc).
  Equivalent to getSequenceRecord().size()

  returns: Length of sequence record - `int`"
  (^Integer [^SequenceRecord this]
    (-> this (.getSequenceLength))))

(defn get-time-step
  "Get a single time step. Equivalent to getSequenceRecord().get(timeStep)

  time-step - Time step to get. Must be 0 <= timeStep < getSequenceLength() - `int`

  returns: Values for a single time step - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^SequenceRecord this ^Integer time-step]
    (-> this (.getTimeStep time-step))))

(defn set-sequence-record
  "Set the sequence record values

  sequence-record - Sequence record values to set - `java.util.List`"
  ([^SequenceRecord this ^java.util.List sequence-record]
    (-> this (.setSequenceRecord sequence-record))))

(defn get-meta-data
  "Get the RecordMetaData for this record

  returns: Metadata for this record (or null, if none has been set) - `org.datavec.api.records.metadata.RecordMetaData`"
  (^org.datavec.api.records.metadata.RecordMetaData [^SequenceRecord this]
    (-> this (.getMetaData))))

(defn set-meta-data
  "Set the Record metadata

  record-meta-data - `org.datavec.api.records.metadata.RecordMetaData`"
  ([^SequenceRecord this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.setMetaData record-meta-data))))

