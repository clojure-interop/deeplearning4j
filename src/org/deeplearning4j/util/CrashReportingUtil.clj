(ns org.deeplearning4j.util.CrashReportingUtil
  "A utility for generating crash reports when an out of memory error occurs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util CrashReportingUtil]))

(defn *crash-dumps-enabled
  "Method that can be used to enable or disable memory crash reporting. Memory crash reporting is enabled by default.

  enabled - `boolean`"
  ([^Boolean enabled]
    (CrashReportingUtil/crashDumpsEnabled enabled)))

(defn *crash-dump-output-directory
  "Method that can be use to customize the output directory for memory crash reporting. By default,
  the current working directory will be used.

  root-dir - Root directory to use for crash reporting. If null is passed, the current working directorywill be used - `java.io.File`"
  ([^java.io.File root-dir]
    (CrashReportingUtil/crashDumpOutputDirectory root-dir)))

(defn *write-memory-crash-dump
  "Generate and write the crash dump to the crash dump root directory (by default, the working directory).
  Naming convention for crash dump files: \"dl4j-memory-crash-dump-_.txt\"

  net - Net to generate the crash dump for. May not be null - `org.deeplearning4j.nn.api.Model`
  e - Throwable/exception. Stack trace will be included in the network output - `java.lang.Throwable`"
  ([^org.deeplearning4j.nn.api.Model net ^java.lang.Throwable e]
    (CrashReportingUtil/writeMemoryCrashDump net e)))

(defn *generate-memory-status
  "Generate memory/system report as a String, for the specified network.
  Includes informatioun about the system, memory configuration, network, etc.

  net - Net to generate the report for - `org.deeplearning4j.nn.api.Model`
  minibatch - `int`
  input-types - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Report as a String - `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.nn.api.Model net ^Integer minibatch ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (CrashReportingUtil/generateMemoryStatus net minibatch input-types)))

(defn *infer-version
  "returns: `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair []
    (CrashReportingUtil/inferVersion )))

