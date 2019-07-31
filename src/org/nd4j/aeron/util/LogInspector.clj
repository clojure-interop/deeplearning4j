(ns org.nd4j.aeron.util.LogInspector
  "Command line utility for inspecting a log buffer to see what terms and messages it contains."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.util LogInspector]))

(defn ->log-inspector
  "Constructor."
  (^LogInspector []
    (new LogInspector )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (LogInspector/main args)))

(defn *format-bytes
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`
  length - `int`

  returns: `char[]`"
  ([^org.agrona.DirectBuffer buffer ^Integer offset ^Integer length]
    (LogInspector/formatBytes buffer offset length)))

(defn *bytes-to-hex
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`
  length - `int`

  returns: `char[]`"
  ([^org.agrona.DirectBuffer buffer ^Integer offset ^Integer length]
    (LogInspector/bytesToHex buffer offset length)))

