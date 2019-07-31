(ns org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.requests CbowRequestMessage]))

(defn ->cbow-request-message
  "Constructor.

  syn-0rows - `int[]`
  syn-1rows - `int[]`
  w-1 - `int`
  codes - `byte[]`
  neg-samples - `int`
  alpha - `double`
  next-random - `long`"
  (^CbowRequestMessage [syn-0rows syn-1rows ^Integer w-1 codes ^Integer neg-samples ^Double alpha ^Long next-random]
    (new CbowRequestMessage syn-0rows syn-1rows w-1 codes neg-samples alpha next-random)))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^CbowRequestMessage this]
    (-> this (.processMessage))))

(defn join-supported?
  "returns: `boolean`"
  (^Boolean [^CbowRequestMessage this]
    (-> this (.isJoinSupported))))

(defn join-message
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^CbowRequestMessage this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.joinMessage message))))

