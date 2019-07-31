(ns org.datavec.api.io.serializers.Serializer
  "Provides a facility for serializing objects of type  to an
 OutputStream.


 Serializers are stateful, but must not buffer the output since
 other producers may write to the output between calls to
 serialize(Object)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.serializers Serializer]))

(defn open
  "Prepare the serializer for writing.

  out - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^Serializer this ^java.io.OutputStream out]
    (-> this (.open out))))

(defn serialize
  "Serialize t to the underlying output stream.

  t - `T`

  throws: java.io.IOException"
  ([^Serializer this t]
    (-> this (.serialize t))))

(defn close
  "Close the underlying output stream and clear up any resources.

  throws: java.io.IOException"
  ([^Serializer this]
    (-> this (.close))))

