package com.amd.aparapi;

/**
 * Created by gfrost on 3/25/14.
 */
public class HSA {
    /* gridsize_u32 $s0, 0;" + "\n" +
            385 " st_global_u32 $s0, [$d0+4];" + "\n" +
            386 " workitemid_u32 $s0, 0;" + "\n" +
            387 " st_global_u32 $s0, [$d0+8];" + "\n" +
            388 " workgroupid_u32 $s0, 0;" + "\n" +
            389 " st_global_u32 $s0, [$d0+12];" + "\n" +
            390 " workgroupsize_u32 $s0, 0;" + "\n" +
            391 " st_global_u32 $s0, [$d0+16];" + "\n" + */

    public static int getGridSize(){ // --> gridsize_u32 $s0, 0
        throw new IllegalStateException("you don't want to call this from Java");
    }

    public static int getWorkItemId(){ // workitemid_u32 $s0, 0;
        throw new IllegalStateException("you don't want to call this from Java");
    }

    public static int getWorkGroupId(){ // workgroupid_u32 $s0, 0;
        throw new IllegalStateException("you don't want to call this from Java");

    }
    public static int getWorkGroupSize(){ // workgroupsize_u32 $s0, 0;
        throw new IllegalStateException("you don't want to call this from Java");

    }

    public static int barrier(){ // barrier_fgroup
        throw new IllegalStateException("you don't want to call this from Java");
    }

    public static int[] local(int size){ // 	align 4 group_u32 %run_cllocal_scratch[256];" + "\n" +
        throw new IllegalStateException("you don't want to call this from Java");
    }
}