(ns org.datavec.api.writable.batch.AbstractWritableRecordBatch$RecordBatchListIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.batch AbstractWritableRecordBatch$RecordBatchListIterator]))

(defn ->record-batch-list-iterator
  "Constructor.

  underlying - `org.datavec.api.writable.batch.AbstractWritableRecordBatch`"
  (^AbstractWritableRecordBatch$RecordBatchListIterator [^org.datavec.api.writable.batch.AbstractWritableRecordBatch underlying]
    (new AbstractWritableRecordBatch$RecordBatchListIterator underlying)))

(defn next
  "returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^AbstractWritableRecordBatch$RecordBatchListIterator this]
    (-> this (.next))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch$RecordBatchListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^AbstractWritableRecordBatch$RecordBatchListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^AbstractWritableRecordBatch$RecordBatchListIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^AbstractWritableRecordBatch$RecordBatchListIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch$RecordBatchListIterator this]
    (-> this (.hasNext))))

(defn add
  "writables - `java.util.List`"
  ([^AbstractWritableRecordBatch$RecordBatchListIterator this ^java.util.List writables]
    (-> this (.add writables))))

(defn set
  "writables - `java.util.List`"
  ([^AbstractWritableRecordBatch$RecordBatchListIterator this ^java.util.List writables]
    (-> this (.set writables))))

(defn next-index
  "returns: `int`"
  (^Integer [^AbstractWritableRecordBatch$RecordBatchListIterator this]
    (-> this (.nextIndex))))

