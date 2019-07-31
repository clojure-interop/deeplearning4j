(ns org.nd4j.jita.constant.ConstantProtector
  "This class implements storage singleton, to guarantee constant buffers persistence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.constant ConstantProtector]))

(defn *get-instance
  "returns: `org.nd4j.jita.constant.ConstantProtector`"
  (^org.nd4j.jita.constant.ConstantProtector []
    (ConstantProtector/getInstance )))

(defn purge-protector
  ""
  ([^ConstantProtector this]
    (-> this (.purgeProtector))))

(defn persist-data-buffer
  "device-id - `int`
  descriptor - `org.nd4j.linalg.api.shape.ShapeDescriptor`
  buffer - `org.nd4j.linalg.primitives.Pair`"
  ([^ConstantProtector this ^Integer device-id ^org.nd4j.linalg.api.shape.ShapeDescriptor descriptor ^org.nd4j.linalg.primitives.Pair buffer]
    (-> this (.persistDataBuffer device-id descriptor buffer)))
  ([^ConstantProtector this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.persistDataBuffer buffer))))

(defn get-data-buffer
  "device-id - `int`
  descriptor - `org.nd4j.linalg.api.shape.ShapeDescriptor`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,long[]>`"
  ([^ConstantProtector this ^Integer device-id ^org.nd4j.linalg.api.shape.ShapeDescriptor descriptor]
    (-> this (.getDataBuffer device-id descriptor))))

(defn contains-data-buffer
  "device-id - `int`
  descriptor - `org.nd4j.linalg.api.shape.ShapeDescriptor`

  returns: `boolean`"
  (^Boolean [^ConstantProtector this ^Integer device-id ^org.nd4j.linalg.api.shape.ShapeDescriptor descriptor]
    (-> this (.containsDataBuffer device-id descriptor))))

