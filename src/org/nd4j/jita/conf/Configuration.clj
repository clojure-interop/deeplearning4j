(ns org.nd4j.jita.conf.Configuration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.conf Configuration]))

(defn ->configuration
  "Constructor."
  (^Configuration []
    (new Configuration )))

(defn set-allocation-model
  "This method allows to specify allocation model for memory.
  DIRECT: Do not cache anything, release memory as soon as it's not used.
  CACHE_HOST: Cache host memory only, Device memory (if any) will use DIRECT mode.
  CACHE_ALL: All memory will be cached.
  Defailt value: CACHE_ALL

  allocation-model - `org.nd4j.jita.conf.Configuration$AllocationModel`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^org.nd4j.jita.conf.Configuration$AllocationModel allocation-model]
    (-> this (.setAllocationModel allocation-model))))

(defn set-verbose
  "verbose - `boolean`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Boolean verbose]
    (-> this (.setVerbose verbose))))

(defn set-no-gc-window-ms
  "This option specifies minimal time gap between two subsequent System.gc() calls
  Set to 0 to disable this option.

  window-ms - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long window-ms]
    (-> this (.setNoGcWindowMs window-ms))))

(defn allow-multi-gpu
  "This method allows you to enable or disable multi-GPU mode.
  PLEASE NOTE: This is NOT magic method, that will automatically scale your application performance.

  really-allow - `boolean`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Boolean really-allow]
    (-> this (.allowMultiGPU really-allow))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Configuration this]
    (-> this (.isInitialized))))

(defn set-maximum-block-size
  "This methos allows to specify max blockSize for kernel launches
  Default value: -1 (that means pick value automatically, device occupancy dependent)

  block-dim - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer block-dim]
    (-> this (.setMaximumBlockSize block-dim))))

(defn trigger-debug
  "code - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer code]
    (-> this (.triggerDebug code))))

(defn set-maximum-single-device-allocation
  "This method allows to specify maximum single allocation on device.
  Default value: Long.MAX_VALUE

  max - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max]
    (-> this (.setMaximumSingleDeviceAllocation max))))

(defn set-minimum-relocation-threshold
  "threshold - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer threshold]
    (-> this (.setMinimumRelocationThreshold threshold))))

(defn set-execution-model
  "Deprecated. Only ExecutionModel.SEQUENTIAL is supported

  execution-model - `org.nd4j.jita.conf.Configuration$ExecutionModel`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^org.nd4j.jita.conf.Configuration$ExecutionModel execution-model]
    (-> this (.setExecutionModel execution-model))))

(defn set-maximum-device-cacheable-length
  "This method allows to specify maximum length of single memory chunk that's allowed to be cached.
  Please note: -1 value totally disables limits here.
  Default value: 96 MB

  max-len - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max-len]
    (-> this (.setMaximumDeviceCacheableLength max-len))))

(defn enable-debug
  "With debug enabled all CUDA launches will become synchronous, with forced stream synchronizations after calls.
  Default value: false;

  debug - `boolean`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Boolean debug]
    (-> this (.enableDebug debug))))

(defn set-maximum-host-cacheable-length
  "This method allows to specify maximum length of single memory chunk that's allowed to be cached.
  Please note: -1 value totally disables limits here.
  Default value: 96 MB

  max-len - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max-len]
    (-> this (.setMaximumHostCacheableLength max-len))))

(defn use-device
  "This method forces specific device to be used. All other devices present in system will be ignored.

  device-id - `java.lang.Integer`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^java.lang.Integer device-id]
    (-> this (.useDevice device-id))))

(defn allow-preallocation
  "If set to true, each non-cached allocation request will cause few additional allocations,
  Default value: true

  really-allow - `boolean`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Boolean really-allow]
    (-> this (.allowPreallocation really-allow))))

(defn set-preallocation-calls
  "This method allows to specify number of preallocation calls done by cache subsystem in parallel, to serve later requests.
  Default value: 25

  num-calls - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer num-calls]
    (-> this (.setPreallocationCalls num-calls))))

(defn set-first-memory
  "This method allows to specify initial memory to be used within system.
  HOST: all data is located on host memory initially, and gets into DEVICE, if used frequent enough
  DEVICE: all memory is located on device.
  DELAYED: memory allocated on HOST first, and on first use gets moved to DEVICE
  PLEASE NOTE: For device memory all data still retains on host side as well.
  Default value: DEVICE

  initial-memory - `org.nd4j.jita.allocator.enums.AllocationStatus`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^org.nd4j.jita.allocator.enums.AllocationStatus initial-memory]
    (-> this (.setFirstMemory initial-memory))))

(defn p-2-p-supported?
  "This method checks, if GPU subsystem supports cross-device P2P access over PCIe.
  PLEASE NOTE: This method also returns TRUE if system has only one device. This is done to guarantee reallocation avoidance within same device.

  returns: `boolean`"
  (^Boolean [^Configuration this]
    (-> this (.isP2PSupported))))

(defn use-devices
  "This method forces specific devices to be used. All other devices present in system will be ignored.

  devices - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer devices]
    (-> this (.useDevices devices))))

(defn set-maximum-zero-allocation
  "This method allows you to set maximum host allocation. However, it's recommended to leave it as default: Xmx  something.

  max - amount of memory in bytes - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max]
    (-> this (.setMaximumZeroAllocation max))))

(defn set-number-of-gc-threads
  "This method allows you to set number of threads that'll handle memory releases on native side.
  Default value: 4

  num-threads - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer num-threads]
    (-> this (.setNumberOfGcThreads num-threads))))

(defn set-memory-model
  "model - `org.nd4j.jita.conf.Configuration$MemoryModel`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^org.nd4j.jita.conf.Configuration$MemoryModel model]
    (-> this (.setMemoryModel model))))

(defn set-maximum-grid-size
  "This method allows to specify max gridDim for kernel launches.
  Default value: 128

  grid-dim - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer grid-dim]
    (-> this (.setMaximumGridSize grid-dim))))

(defn set-command-queue-length
  "This method allows you to specify command queue length, as primary argument for asynchronous execution controller
  Default value: 3

  length - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer length]
    (-> this (.setCommandQueueLength length))))

(defn set-maximum-device-cache
  "This method allows you to specify maximum memory cache per device

  max-cache - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max-cache]
    (-> this (.setMaximumDeviceCache max-cache))))

(defn set-maximum-host-cache
  "This method allows you to specify maximum memory cache for host memory

  max-cache - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max-cache]
    (-> this (.setMaximumHostCache max-cache))))

(defn ban-device
  "This method allows you to ban specific device.
  PLEASE NOTE: This method

  device-id - `java.lang.Integer`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^java.lang.Integer device-id]
    (-> this (.banDevice device-id))))

(defn set-maximum-single-host-allocation
  "This method allows to specify maximum single allocation on host.
  Default value: Long.MAX_VALUE

  max - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max]
    (-> this (.setMaximumSingleHostAllocation max))))

(defn set-initialized
  ""
  ([^Configuration this]
    (-> this (.setInitialized))))

(defn set-pool-size
  "Per-device resources pool size. Streams, utility memory

  pool-size - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer pool-size]
    (-> this (.setPoolSize pool-size))))

(defn set-maximum-device-allocation
  "This method allows you to set maximum device allocation. It's recommended to keep it equal to MaximumZeroAllocation

  max - `long`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Long max]
    (-> this (.setMaximumDeviceAllocation max))))

(defn set-maximum-device-memory-used
  "This method allows you to specify max per-device memory use.
  PLEASE NOTE: Accepted value range is 0.01 > x < 0.95

  percentage - `double`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Double percentage]
    (-> this (.setMaximumDeviceMemoryUsed percentage))))

(defn set-minimum-block-size
  "block-dim - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer block-dim]
    (-> this (.setMinimumBlockSize block-dim))))

(defn forced-single-gpu?
  "returns: `boolean`"
  (^Boolean [^Configuration this]
    (-> this (.isForcedSingleGPU))))

(defn allow-fallback-from-device
  "NOT IMPLEMENTED YET

  really-allow - `boolean`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Boolean really-allow]
    (-> this (.allowFallbackFromDevice really-allow))))

(defn allow-cross-device-access
  "Enables/disables P2P memory access for multi-gpu

  really-allow - `boolean`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Boolean really-allow]
    (-> this (.allowCrossDeviceAccess really-allow))))

(defn set-command-lanes-number
  "This method allows you to specify maximum number of probable parallel cuda processes
  Default value: 4
  PLEASE NOTE: This parameter has effect only for ASYNCHRONOUS execution model

  length - `int`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Integer length]
    (-> this (.setCommandLanesNumber length))))

(defn enable-dashboard
  "This method enables/disables

  really-enable - `boolean`

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Configuration this ^Boolean really-enable]
    (-> this (.enableDashboard really-enable))))

