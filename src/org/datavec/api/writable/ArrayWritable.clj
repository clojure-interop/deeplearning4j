(ns org.datavec.api.writable.ArrayWritable
  "A Writable to basically wrap an array of sorts."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable ArrayWritable]))

(defn ->array-writable
  "Constructor."
  (^ArrayWritable []
    (new ArrayWritable )))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^ArrayWritable this]
    (-> this (.toDouble))))

(defn get-long
  "i - `long`

  returns: `long`"
  (^Long [^ArrayWritable this ^Long i]
    (-> this (.getLong i))))

(defn get-int
  "i - `long`

  returns: `int`"
  (^Integer [^ArrayWritable this ^Long i]
    (-> this (.getInt i))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^ArrayWritable this]
    (-> this (.toFloat))))

(defn length
  "returns: `long`"
  (^Long [^ArrayWritable this]
    (-> this (.length))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^ArrayWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^ArrayWritable this]
    (-> this (.toInt))))

(defn get-float
  "i - `long`

  returns: `float`"
  (^Float [^ArrayWritable this ^Long i]
    (-> this (.getFloat i))))

(defn get-double
  "i - `long`

  returns: `double`"
  (^Double [^ArrayWritable this ^Long i]
    (-> this (.getDouble i))))

