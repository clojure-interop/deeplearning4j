(ns org.nd4j.aeron.ipc.response.NDArrayResponseFragmentHandler
  "A subscriber that listens for host
 port pairs in the form of host:port.
 These are meant to be aeron channels.
 Given an @link{NDArrayHolder} it will send
 the ndarray to the designated channel by the subscriber."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc.response NDArrayResponseFragmentHandler]))

(defn ->nd-array-response-fragment-handler
  "Constructor."
  (^NDArrayResponseFragmentHandler []
    (new NDArrayResponseFragmentHandler )))

(defn on-fragment
  "Callback for handling fragments of data being read from a log.

  buffer - containing the data. - `org.agrona.DirectBuffer`
  offset - at which the data begins. - `int`
  length - of the data in bytes. - `int`
  header - representing the meta data for the data. - `io.aeron.logbuffer.Header`"
  ([^NDArrayResponseFragmentHandler this ^org.agrona.DirectBuffer buffer ^Integer offset ^Integer length ^io.aeron.logbuffer.Header header]
    (-> this (.onFragment buffer offset length header))))

