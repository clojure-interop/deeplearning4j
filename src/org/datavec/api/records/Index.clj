(ns org.datavec.api.records.Index
  "Interface that acts as an iterator for deserializing maps.
 The deserializer returns an instance that the record uses to
 read vectors and maps. An example of usage is as follows:

 Index idx = startVector(...);
 while (!idx.done()) {
 .... // read element of a vector
 idx.incr();
 }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records Index]))

(defn done
  "returns: `boolean`"
  (^Boolean [^Index this]
    (-> this (.done))))

(defn incr
  ""
  ([^Index this]
    (-> this (.incr))))

