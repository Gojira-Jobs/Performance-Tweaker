package com.phantomLord.cpufrequtils.app.utils;

import com.phantomLord.cpufrequtils.app.R;

public class Constants {

    public final static String App_Tag = "Performace Tweaker";
    /*
    Cpu
     */
    public final static String cpufreq_sys_dir = "/sys/devices/system/cpu/cpu0/cpufreq/";
    public final static String scaling_min_freq = cpufreq_sys_dir
            + "scaling_min_freq";
    public final static String cpuinfo_min_freq = cpufreq_sys_dir
            + "cpuinfo_min_freq";
    public final static String scaling_max_freq = cpufreq_sys_dir
            + "scaling_max_freq";

    public final static String cpuinfo_max_freq = cpufreq_sys_dir
            + "cpuinfo_max_freq";
    public final static String scaling_cur_freq = cpufreq_sys_dir
            + "scaling_cur_freq";
    public final static String cpuinfo_cur_freq = cpufreq_sys_dir
            + "cpuinfo_cur_freq";
    public final static String scaling_governor = cpufreq_sys_dir
            + "scaling_governor";
    public final static String scaling_available_freq = cpufreq_sys_dir
            + "scaling_available_frequencies";
    public final static String scaling_available_governors = cpufreq_sys_dir
            + "scaling_available_governors";
    public final static String governor_prop_dir = "/sys/devices/system/cpu/cpufreq/";
    /*
    I/O
     */
    public final static String available_blockdevices = "/sys/block/";
    public final static String available_schedulers = "/sys/block/mmcblk0/queue/scheduler";
    public final static String available_schedulers_path = "/sys/block/mmcblk1/queue/scheduler";
    public static final String time_in_states = "/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state";
    public final static String ioscheduler_mtd = "/sys/block/mtdblock0/queue/scheduler";
    public static final String SD_CACHE = "/sys/devices/virtual/bdi/179:0/read_ahead_kb";
    public static final String[] readAheadKb = {"64", "128", "256", "384",
            "512", "640", "768", "896", "1024", "1152", "1280", "1408", "1536",
            "1664", "1792", "1920", "2048", "2176", "2304", "2432", "2560",
            "2688", "2816", "2944", "3072", "3200", "3328", "3456", "3584",
            "3712", "3840", "3968", "4096"};
    /*
    GPU
     */
    public static final String[] GPU_PATH = new String[]{
            "/sys/class/kgsl",
            "/sys/devices/platform/galcore/gpu/gpu0/gpufreq"
    };
    public static final String[] gpu_governor_path = new String[]{
            "/kgsl-3d0/pwrscale/trustzone/governor",
            "/kgsl-3d0/devfreq/governor",
            "/scaling_governor"
    };
    public static final String[] gpu_govs_avail_path = new String[]{
            "/kgsl-3d0/devfreq/available_governors",
            "/scaling_available_governors"
    };
    public static final String[] gpu_freqs_avail = new String[]{
            "/kgsl-3d0/gpu_available_frequencies",
            "/kgsl-3d0/devfreq/available_frequencies",
            "/scaling_available_frequencies"
    };
    public static final String[] gpu_freqs_max = new String[]{
            "/kgsl-3d0/max_gpuclk",
            "/kgsl-3d0/devfreq/max_freq",
            "/scaling_max_freq"
    };
    public static final String[] gpu_freqs_min = new String[]{
            "/kgsl-3d0/min_gpuclk",
            "/kgsl-3d0/devfreq/min_freq",
            "/scaling_min_freq"
    };
    public final static String[] mFragmentsArray = new String[]{
            "Cpu Frequency", "Time In State", "I/0 Control", "Wakelocks",
            "Settings"};
    public static final int icons[] = new int[]{R.drawable.ic_action_meter,
            R.drawable.ic_action_bar_chart, R.drawable.ic_action_backup,
            R.drawable.ic_action_battery_med,
            R.drawable.ic_action_prefs_widget};
    public final static String[] wakelockTypes = new String[]{
            "Kernel Wakelocks", "Cpu Wakelocks", "Wakeup Triggers"};
    /*
     * Preferences
     */
    public final static String PREF_ZERO_VALS = "non_zero_vals_only";
    public final static String PREF_MAX_FREQ = "max_freq";
    public final static String PREF_MIN_FREQ = "min_freq";
    public final static String PREF_GOV = "governor";
    public final static String PREF_CPU_APPLY_ON_BOOT = "cpu_apply_on_boot";
    public final static String PREF_IO_APPLY_ON_BOOT = "io_apply_boot";
    public final static String PREF_IO_SCHEDULER = "io_scheduler";
    public final static String PREF_READ_AHEAD = "read_ahead";
    public final static String PREF_TIS_RESET_STATS = "tis_reset_stats";
    public static String CPU_0 = "Core 0";
    public static String CPU_1 = "Core 1";
    public static String CPU_2 = "Core 2";
    public static String CPU_3 = "Core 3";
    public static String CPU_ALL = "All Cores";

}
