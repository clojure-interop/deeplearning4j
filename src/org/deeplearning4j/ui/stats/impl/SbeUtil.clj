(ns org.deeplearning4j.ui.stats.impl.SbeUtil
  "Utilities for use in SbeStatsInitializationReport and SbeStatsReport"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.impl SbeUtil]))

(def *-utf-8
  "Static Constant.

  type: java.nio.charset.Charset"
  SbeUtil/UTF8)

(def *-empty-bytes
  "Static Constant.

  type: byte[]"
  SbeUtil/EMPTY_BYTES)

(defn *length
  "bytes - `byte[]`

  returns: `int`"
  (^Integer [bytes]
    (SbeUtil/length bytes)))

(defn *to-bytes
  "present - `boolean`
  str - `java.lang.String`

  returns: `byte[]`"
  ([^Boolean present ^java.lang.String str]
    (SbeUtil/toBytes present str))
  ([^java.util.Map map]
    (SbeUtil/toBytes map)))

(defn *to-bytes-serializable
  "serializable - `java.io.Serializable`

  returns: `byte[]`"
  ([^java.io.Serializable serializable]
    (SbeUtil/toBytesSerializable serializable)))

(defn *from-bytes-serializable
  "bytes - `byte[]`

  returns: `java.io.Serializable`"
  (^java.io.Serializable [bytes]
    (SbeUtil/fromBytesSerializable bytes)))

