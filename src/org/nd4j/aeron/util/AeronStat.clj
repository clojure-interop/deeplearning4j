(ns org.nd4j.aeron.util.AeronStat
  "Tool for printing out Aeron counters. A command-and-control (cnc) file is maintained by media driver
 in shared memory. This application reads the the cnc file and prints the counters. Layout of the cnc file is
 described in CncFileDescriptor.
 This tool accepts filters on the command line, e.g. for connections only see example below:

 java -cp aeron-samples/build/libs/samples.jar io.aeron.samples.AeronStat opType=[1-4] identity=12345"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.util AeronStat]))

(defn ->aeron-stat
  "Constructor.

  counters - `org.agrona.concurrent.status.CountersReader`
  type-filter - `java.util.regex.Pattern`
  identity-filter - `java.util.regex.Pattern`
  session-filter - `java.util.regex.Pattern`
  stream-filter - `java.util.regex.Pattern`
  channel-filter - `java.util.regex.Pattern`"
  (^AeronStat [^org.agrona.concurrent.status.CountersReader counters ^java.util.regex.Pattern type-filter ^java.util.regex.Pattern identity-filter ^java.util.regex.Pattern session-filter ^java.util.regex.Pattern stream-filter ^java.util.regex.Pattern channel-filter]
    (new AeronStat counters type-filter identity-filter session-filter stream-filter channel-filter))
  (^AeronStat [^org.agrona.concurrent.status.CountersReader counters]
    (new AeronStat counters)))

(defn *map-counters
  "returns: `org.agrona.concurrent.status.CountersReader`"
  (^org.agrona.concurrent.status.CountersReader []
    (AeronStat/mapCounters )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (AeronStat/main args)))

(defn print
  "out - `java.io.PrintStream`"
  ([^AeronStat this ^java.io.PrintStream out]
    (-> this (.print out))))

