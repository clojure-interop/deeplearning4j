(ns org.tensorflow.framework.ReaderBaseStateOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ReaderBaseStateOrBuilder]))

(defn get-work-started
  "int64 work_started = 1;

  returns: `long`"
  (^Long [^ReaderBaseStateOrBuilder this]
    (-> this (.getWorkStarted))))

(defn get-work-finished
  "int64 work_finished = 2;

  returns: `long`"
  (^Long [^ReaderBaseStateOrBuilder this]
    (-> this (.getWorkFinished))))

(defn get-num-records-produced
  "int64 num_records_produced = 3;

  returns: `long`"
  (^Long [^ReaderBaseStateOrBuilder this]
    (-> this (.getNumRecordsProduced))))

(defn get-current-work
  "bytes current_work = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ReaderBaseStateOrBuilder this]
    (-> this (.getCurrentWork))))

