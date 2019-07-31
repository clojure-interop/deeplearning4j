(ns org.nd4j.aeron.ipc.AeronUtil
  "Utility functions for samples"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc AeronUtil]))

(defn ->aeron-util
  "Constructor."
  (^AeronUtil []
    (new AeronUtil )))

(defn *get-media-driver-context
  "Get a media driver context
  for sending ndarrays
  based on a given length
  where length is the length (number of elements)
  in the ndarrays hat are being sent

  length - the length to based the ipc length - `int`

  returns: the media driver context based on the given length - `io.aeron.driver.MediaDriver.Context`"
  (^io.aeron.driver.MediaDriver.Context [^Integer length]
    (AeronUtil/getMediaDriverContext length)))

(defn *aeron-channel
  "Aeron channel generation

  host - the host - `java.lang.String`
  port - the port - `int`

  returns: the aeron channel via udp - `java.lang.String`"
  (^java.lang.String [^java.lang.String host ^Integer port]
    (AeronUtil/aeronChannel host port)))

(defn *subscriber-loop
  "Return a reusable, parameterized event
  loop that calls and idler
  when no messages are received

  fragment-handler - to be called back for each message. - `io.aeron.logbuffer.FragmentHandler`
  limit - passed to Subscription.poll(FragmentHandler, int) - `int`
  running - indication for loop - `java.util.concurrent.atomic.AtomicBoolean`
  idle-strategy - to use for loop - `org.agrona.concurrent.IdleStrategy`
  launched - `java.util.concurrent.atomic.AtomicBoolean`

  returns: loop function - `java.util.function.Consumer<io.aeron.Subscription>`"
  (^java.util.function.Consumer [^io.aeron.logbuffer.FragmentHandler fragment-handler ^Integer limit ^java.util.concurrent.atomic.AtomicBoolean running ^org.agrona.concurrent.IdleStrategy idle-strategy ^java.util.concurrent.atomic.AtomicBoolean launched]
    (AeronUtil/subscriberLoop fragment-handler limit running idle-strategy launched))
  (^java.util.function.Consumer [^io.aeron.logbuffer.FragmentHandler fragment-handler ^Integer limit ^java.util.concurrent.atomic.AtomicBoolean running ^java.util.concurrent.atomic.AtomicBoolean launched]
    (AeronUtil/subscriberLoop fragment-handler limit running launched)))

(defn *print-string-message
  "Return a reusable, parameterized FragmentHandler that prints to stdout

  stream-id - to show when printing - `int`

  returns: subscription data handler function that prints the message contents - `io.aeron.logbuffer.FragmentHandler`"
  (^io.aeron.logbuffer.FragmentHandler [^Integer stream-id]
    (AeronUtil/printStringMessage stream-id)))

(defn *print-error
  "Generic error handler that just prints message to stdout.

  channel - for the error - `java.lang.String`
  stream-id - for the error - `int`
  session-id - for the error, if source - `int`
  message - indicating what the error was - `java.lang.String`
  cause - of the error - `io.aeron.protocol.HeaderFlyweight`"
  ([^java.lang.String channel ^Integer stream-id ^Integer session-id ^java.lang.String message ^io.aeron.protocol.HeaderFlyweight cause]
    (AeronUtil/printError channel stream-id session-id message cause)))

(defn *print-rate
  "Print the rates to stdout

  messages-per-sec - being reported - `double`
  bytes-per-sec - being reported - `double`
  total-messages - being reported - `long`
  total-bytes - being reported - `long`"
  ([^Double messages-per-sec ^Double bytes-per-sec ^Long total-messages ^Long total-bytes]
    (AeronUtil/printRate messages-per-sec bytes-per-sec total-messages total-bytes)))

(defn *print-available-image
  "Print the information for an available image to stdout.

  image - that has been created - `io.aeron.Image`"
  ([^io.aeron.Image image]
    (AeronUtil/printAvailableImage image)))

(defn *print-unavailable-image
  "Print the information for an unavailable image to stdout.

  image - that has gone inactive - `io.aeron.Image`"
  ([^io.aeron.Image image]
    (AeronUtil/printUnavailableImage image)))

