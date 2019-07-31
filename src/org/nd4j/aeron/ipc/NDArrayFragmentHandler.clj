(ns org.nd4j.aeron.ipc.NDArrayFragmentHandler
  "NDArray fragment handler
 for listening to an aeron queue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc NDArrayFragmentHandler]))

(defn ->nd-array-fragment-handler
  "Constructor.

  nd-array-callback - `org.nd4j.aeron.ipc.NDArrayCallback`"
  (^NDArrayFragmentHandler [^org.nd4j.aeron.ipc.NDArrayCallback nd-array-callback]
    (new NDArrayFragmentHandler nd-array-callback)))

(defn on-fragment
  "Callback for handling
  fragments of data being read from a log.

  buffer - containing the data. - `org.agrona.DirectBuffer`
  offset - at which the data begins. - `int`
  length - of the data in bytes. - `int`
  header - representing the meta data for the data. - `io.aeron.logbuffer.Header`"
  ([^NDArrayFragmentHandler this ^org.agrona.DirectBuffer buffer ^Integer offset ^Integer length ^io.aeron.logbuffer.Header header]
    (-> this (.onFragment buffer offset length header))))

