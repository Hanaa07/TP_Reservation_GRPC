// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.hotel.tp_reservation_grpc.stubs;

public interface ReservationListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReservationListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<com.hotel.tp_reservation_grpc.stubs.Reservation> 
      getReservationsList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  com.hotel.tp_reservation_grpc.stubs.Reservation getReservations(int index);
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  int getReservationsCount();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<? extends com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder> 
      getReservationsOrBuilderList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder getReservationsOrBuilder(
      int index);
}