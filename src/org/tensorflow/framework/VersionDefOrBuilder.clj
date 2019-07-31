(ns org.tensorflow.framework.VersionDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VersionDefOrBuilder]))

(defn get-producer
  "The version of the code that produced this data.
  int32 producer = 1;

  returns: `int`"
  (^Integer [^VersionDefOrBuilder this]
    (-> this (.getProducer))))

(defn get-min-consumer
  "Any consumer below this version is not allowed to consume this data.
  int32 min_consumer = 2;

  returns: `int`"
  (^Integer [^VersionDefOrBuilder this]
    (-> this (.getMinConsumer))))

(defn get-bad-consumers-list
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^VersionDefOrBuilder this]
    (-> this (.getBadConsumersList))))

(defn get-bad-consumers-count
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  returns: `int`"
  (^Integer [^VersionDefOrBuilder this]
    (-> this (.getBadConsumersCount))))

(defn get-bad-consumers
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  index - `int`

  returns: `int`"
  (^Integer [^VersionDefOrBuilder this ^Integer index]
    (-> this (.getBadConsumers index))))

