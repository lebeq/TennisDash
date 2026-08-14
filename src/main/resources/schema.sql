--- SQLite schema
--- Date and time stored as text
--- conversion done in persistance package

CREATE TABLE IF NOT EXISTS clubs(
    ClubId INTEGER NOT NULL PRIMARY KEY,
    Name TEXT NOT NULL,
    Location TEXT NOT NULL,
    Courts INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS users(
    UserId INTEGER NOT NULL PRIMARY KEY,
    FirstName TEXT NOT NULL,
    LastName TEXT NOT NULL,
    Membership INTEGER NOT NULL,
    FOREIGN KEY (Membership) REFERENCES clubs(ClubId),
);

CREATE TABLE IF NOT EXISTS courts(
    CourtId INTEGER NOT NULL PRIMARY KEY,
    Club INTEGER NOT NULL,
    Surface TEXT NOT NULL,
    FOREIGN KEY (Club) REFERENCES clubs(ClubId)
);

CREATE TABLE IF NOT EXISTS bookings(
    BookingId INTEGER NOT NULL PRIMARY KEY,
    Date TEXT NOT NULL,
    Time TEXT NOT NULL,
    User INTEGER NOT NULL,
    FOREIGN KEY (User) REFERENCES users(UserId)
);

CREATE TABLE IF NOT EXISTS payment(
    PaymentId INTEGER NOT NULL PRIMARY KEY,
    Booking INTEGER,
    Date TEXT NOT NULL,
    Time TEXT NOT NULL,
    FOREIGN KEY (Booking) REFERENCES bookings(BookingId)
);