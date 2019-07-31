(ns org.datavec.api.io.serializers.Deserializer
  "Provides a facility for deserializing objects of type  from an
 InputStream.


 Deserializers are stateful, but must not buffer the input since
 other producers may read from the input between calls to
 deserialize(Object)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.serializers Deserializer]))

(defn open
  "Prepare the deserializer for reading.

  in - `java.io.InputStream`

  throws: java.io.IOException"
  ([^Deserializer this ^java.io.InputStream in]
    (-> this (.open in))))

(defn deserialize
  "Deserialize the next object from the underlying input stream.
  If the object t is non-null then this deserializer
  may set its internal state to the next object read from the input
  stream. Otherwise, if the object t is null a new
  deserialized object will be created.

  t - `T`

  returns: the deserialized object - `T`

  throws: java.io.IOException"
  ([^Deserializer this t]
    (-> this (.deserialize t))))

(defn close
  "Close the underlying input stream and clear up any resources.

  throws: java.io.IOException"
  ([^Deserializer this]
    (-> this (.close))))

